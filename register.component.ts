import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user1:User=new User();
  constructor(private user:UserService) { }

  ngOnInit(): void {
  }

  save(obj:any){
    this.user1.id=obj.id;
    this.user1.firstname=obj.firstname;
    this.user1.lastname=obj.lastname;
    this.user1.emailid=obj.emailid;
    this.user1.password=obj.password;
    this.user1.confirmpassword=obj.confirmpassword;
    this.user1.DOB=obj.DOB;
    this.user1.mobileno=obj.mobileno;
    this.user1.account=obj.account;
    if(this.user1!==null)

    this.user.saveEmp(this.user1).subscribe((res)=>{
      console.log(res);
    });
  }
}