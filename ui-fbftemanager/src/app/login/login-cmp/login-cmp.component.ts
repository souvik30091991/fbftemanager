import { Component, OnInit } from '@angular/core';
import { Loginmodel } from 'src/app/client-models/loginmodels/loginmodel';
import { MatDialog } from '@angular/material';
import { LoginserviceService } from 'src/app/client-services/loginservices/loginservice.service';
import { OkdialogcmpComponent } from 'src/app/dialogs/okdialogcmp/okdialogcmp.component';



@Component({
  selector: 'app-login-cmp',
  templateUrl: './login-cmp.component.html',
  styleUrls: ['./login-cmp.component.scss']
})
export class LoginCmpComponent implements OnInit {

    loginmodel: Loginmodel = new Loginmodel();

  constructor(private loginservice: LoginserviceService, private okDialogue: MatDialog) { }

  ngOnInit() {
  }

submitMe() {
        console.log(this.loginmodel);
        this.loginservice.authenticateIt(this.loginmodel)
            .subscribe(
                data => {
                    console.log('Success!', data);
                    this.okDialogue.open(OkdialogcmpComponent, {
                        data: {
                            message: 'Login Successful!',
                            buttonText: {
                                ok: 'OK'
                                // cancel: 'No'
                            }
                        }
                    });
                },
                error => {
                    console.error('Error!', error);
                    this.okDialogue.open(OkdialogcmpComponent, {
                        data: {
                            message: 'Something went wrong! Please try again/Contact the administrator!',
                            buttonText: {
                                ok: 'OK'
                                // cancel: 'No'
                            }
                        }
                    });
                }
            );

    }

}
