import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FteCmpComponent } from './fte-cmp/fte-cmp.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatFormFieldModule, MatDatepickerModule, MatNativeDateModule, MatInputModule, MatSidenavModule } from '@angular/material';
import { ViewfteCmpComponent } from './viewfte-cmp/viewfte-cmp.component';
import { SidenavComponent } from '../sidenav/sidenav.component';
import { AppRoutingModule } from '../app-routing.module';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
@NgModule({
    declarations: [FteCmpComponent, ViewfteCmpComponent, SidenavComponent],
    imports: [
        CommonModule,
        AppRoutingModule,
        MatInputModule,
        BrowserAnimationsModule,
        MatNativeDateModule,
        MatDatepickerModule,
        MatFormFieldModule,
        MatSidenavModule,
        FormsModule,
        ReactiveFormsModule
    ],
    entryComponents: [FteCmpComponent],
    bootstrap: [FteCmpComponent],
    providers: [],
    exports: [FteCmpComponent]
})
export class FteModule { }
