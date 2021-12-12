import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserRegLogService } from 'src/app/services/user-reg-log.service';
import { User } from 'src/app/classes/user';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {
  user = new User();
  msg='';
  constructor(private _service : UserRegLogService, private _router: Router) { }

  ngOnInit(): void {
  }

  registerUser(){
    this._service.registerUserFromRemote(this.user).subscribe(
      data=>{
console.log("response recieved register success")
this.msg="registration success";
this._router.navigate(['/login'])

      },

      error=>{
        console.log("exception occured, registration failed")
this.msg=error.error;
      }


    )
  }


}
