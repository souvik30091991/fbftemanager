import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginCmpComponent } from './login-cmp/login-cmp.component';

@NgModule({
  declarations: [LoginCmpComponent],
  imports: [
    CommonModule
  ],
  exports : [LoginCmpComponent]
})
export class LoginModule { }
