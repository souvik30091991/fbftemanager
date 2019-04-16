import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FteCmpComponent } from './fte/fte-cmp/fte-cmp.component';
import { LoginCmpComponent } from './login/login-cmp/login-cmp.component';
import { ViewfteCmpComponent } from './fte/viewfte-cmp/viewfte-cmp.component';

const routes: Routes = [
    { path: '', component: LoginCmpComponent },
    {path: 'login', component: LoginCmpComponent   },
    {path: 'newfte', component: FteCmpComponent   },
    {path: 'viewfte', component: ViewfteCmpComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
