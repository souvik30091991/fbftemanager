import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardCmpComponent } from './dashboard/dashboard-cmp/dashboard-cmp.component';
import { FteCmpComponent } from './fte/fte-cmp/fte-cmp.component';
import { ViewfteCmpComponent } from './fte/viewfte-cmp/viewfte-cmp.component';
import { LoginCmpComponent } from './login/login-cmp/login-cmp.component';

const routes: Routes = [
    { path: '', component: LoginCmpComponent, pathMatch: 'full' },
    { path: 'dashboard', component: DashboardCmpComponent },
    {
        path: 'dashboard/', component: DashboardCmpComponent,
        children: [
            { path: '', redirectTo: 'dashboard', pathMatch: 'full' },
            { path: 'newfte', component: FteCmpComponent },
            { path: 'viewfte', component: ViewfteCmpComponent },
        ]
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
