import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './nav/nav.component';
import { FooterComponent } from './footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { LoginCmpComponent } from './login/login-cmp/login-cmp.component';
import { DashboardModule} from './dashboard/dashboard.module';

@NgModule({
    declarations: [
        AppComponent,
        NavComponent,
        FooterComponent,
        LoginCmpComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        DashboardModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
