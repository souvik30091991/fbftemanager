import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardCmpComponent } from './dashboard-cmp/dashboard-cmp.component';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';
import { FteCmpComponent } from '../fte/fte-cmp/fte-cmp.component';
import { ViewfteCmpComponent } from '../fte/viewfte-cmp/viewfte-cmp.component';
import { SidenavCmpComponent } from '../sidenav/sidenav-cmp/sidenav-cmp.component';
import { CustomMaterialModule } from '../material/material.module';
import { FteModule } from '../fte/fte.module';
import { FeedbackModule } from '../feedback/feedback.module';
import { ViewfeedbackCmpComponent } from '../feedback/viewfeedback-cmp/viewfeedback-cmp.component';

const appRoutes: Routes = [
    { path: 'dashboard/', component: FteCmpComponent, pathMatch: 'full' },
    {
        path: 'dashboard', component: DashboardCmpComponent,
        children: [
            { path: 'newfte', component: FteCmpComponent },
            { path: 'viewfte', component: ViewfteCmpComponent },
            { path: 'viewfeedback', component: ViewfeedbackCmpComponent }
        ]
    }
];

@NgModule({
    declarations: [DashboardCmpComponent, SidenavCmpComponent],
    imports: [
        CommonModule,
        BrowserModule,
        BrowserAnimationsModule,
        RouterModule.forChild(
            appRoutes,
        ),
        FteModule,
        FeedbackModule,
        CustomMaterialModule
    ],
})
export class DashboardModule { }
