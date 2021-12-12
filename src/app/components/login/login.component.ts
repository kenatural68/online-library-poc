import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserRegLogService } from 'src/app/services/user-reg-log.service';
import { User } from 'src/app/classes/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
   user = new User();
   msg='';

  constructor(private _service : UserRegLogService, private _router :Router) { }

  ngOnInit(): void {
  }
  loginUser(){
this._service.loginUserFromRemote(this.user).subscribe(
  data => {
    console.log("response recieved")
    this._router.navigate(['/library'])
  },

  error => {
    
    console.log("exception occured") 
    this.msg="bad credentials";
}

  )
  }
}
