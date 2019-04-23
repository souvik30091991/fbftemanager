import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FteCmpComponent } from './fte-cmp/fte-cmp.component';
import { ViewfteCmpComponent } from './viewfte-cmp/viewfte-cmp.component';
import { AppRoutingModule } from '../app-routing.module';
import { CustomMaterialModule } from '../material/material.module';


@NgModule({
    declarations: [FteCmpComponent, ViewfteCmpComponent],
    imports: [
        CommonModule,
        AppRoutingModule,
        CustomMaterialModule
    ],
    entryComponents: [FteCmpComponent, ViewfteCmpComponent],
    bootstrap: [FteCmpComponent, ViewfteCmpComponent],
    providers: [],
    exports: [FteCmpComponent, ViewfteCmpComponent]
})
export class FteModule { }
