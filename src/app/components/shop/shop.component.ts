import { Component, OnInit } from '@angular/core';
import { BookservService } from 'src/app/services/bookserv.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.css']
})
export class ShopComponent implements OnInit {

  constructor(private _service :BookservService, private _http: HttpClient) { }
showall:any
  ngOnInit(): void {
   this.allbooks();
  }

  allbooks(){
    return this._http.get("http://localhost:8080/onlinelibrary/list").subscribe((result)=>{
      this.showall=result;
      console.log(this.showall=result);
    }
    )
  }

}
