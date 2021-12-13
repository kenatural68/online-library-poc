import { Component, OnInit } from '@angular/core';
// import { AddbooksService } from 'src/app/services/addbooks.service';
import { Router } from '@angular/router';
// import { Book } from 'src/app/classes/book';
import { HttpClient, HttpEventType } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FormGroup } from '@angular/forms';
// import { AddbooksService } from 'src/app/services/addbooks.service';


@Component({
  selector: 'app-addbooks',
  templateUrl: './addbooks.component.html',
  styleUrls: ['./addbooks.component.css']
})
export class AddbooksComponent implements OnInit {
  // book = new Book();
  
  // constructor(private _service :AddbooksService , private _router: Router) { }
  constructor( private _router: Router, private _http : HttpClient) { }
  selectedFile: any;
  // retrievedImage: any;
  // base64Data: any;
  // retrieveResonse: any;
  message: any;
  // imageName: any;
  msg='';
  title:any;
	author:any;
	genre:any;
  AddDetailsForm:any;

  he:any;
  ngOnInit(): void {
  }
  public onFileChanged(event:any) {
    //Select File
    this.selectedFile = event.target.files[0];
  }

  onUpload(AddDetailsForm: FormGroup) {
    console.log(this.selectedFile);
    
    // const bookdetails = AddDetailsForm.value;
    const addbookdata = new FormData();
    addbookdata.append('bookpdf', this.selectedFile, this.selectedFile.bookpdf );
    // addbookdata.append(this.title,this.author,this.genre);

  //   const adddata = new this.he;
  //  this.he.append(this.title,this.author,this.genre);

  
    
  
    this._http.post('http://localhost:8080/upload', addbookdata)
    .subscribe(
      data=>{
console.log("book successfully added")
this.msg="book successfully added";

      },

      error=>{
        console.log("exception occured")
this.msg=error.error;
      })


  }



}
