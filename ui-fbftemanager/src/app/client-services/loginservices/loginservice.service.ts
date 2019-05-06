import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Loginmodel } from 'src/app/client-models/loginmodels/loginmodel';

@Injectable({
  providedIn: 'root'
})
export class LoginserviceService {

    postUrl = 'http://localhost:9151/loginservice/authenticate';

  constructor(private client: HttpClient) { }

      authenticateIt(loginModel: Loginmodel) {
        return this.client.post<any>(this.postUrl, loginModel);
    }
}
