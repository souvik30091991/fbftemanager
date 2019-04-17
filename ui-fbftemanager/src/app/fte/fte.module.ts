import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FteCmpComponent } from './fte-cmp/fte-cmp.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatFormFieldModule, MatDatepickerModule, MatNativeDateModule, MatInputModule } from '@angular/material';
import { ViewfteCmpComponent } from './viewfte-cmp/viewfte-cmp.component';
import { AppRoutingModule } from '../app-routing.module';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
    declarations: [FteCmpComponent, ViewfteCmpComponent],
    imports: [
        CommonModule,
        AppRoutingModule,
        MatInputModule,
        BrowserAnimationsModule,
        MatNativeDateModule,
        MatDatepickerModule,
        MatFormFieldModule,
        FormsModule,
        ReactiveFormsModule
    ],
    entryComponents: [FteCmpComponent, ViewfteCmpComponent],
    bootstrap: [FteCmpComponent, ViewfteCmpComponent],
    providers: [],
    exports: [FteCmpComponent, ViewfteCmpComponent]
})
export class FteModule { }
