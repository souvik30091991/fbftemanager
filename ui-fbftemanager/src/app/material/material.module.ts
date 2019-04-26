import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
    MatButtonModule, MatNativeDateModule, MatIconModule, MatSidenavModule, MatListModule, MatToolbarModule, MatDialogModule,
    MatInputModule, MatDatepickerModule, MatFormFieldModule, MatTableModule
} from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
    imports: [CommonModule, MatButtonModule, MatToolbarModule, MatNativeDateModule,
        MatIconModule, MatSidenavModule, MatListModule, MatDialogModule,
        MatInputModule, BrowserAnimationsModule, MatDatepickerModule, MatFormFieldModule, MatTableModule, FormsModule,
        ReactiveFormsModule],
    exports: [CommonModule, MatButtonModule, MatToolbarModule, MatNativeDateModule,
        MatIconModule, MatSidenavModule, MatListModule, MatDialogModule,
        MatInputModule, BrowserAnimationsModule, MatDatepickerModule, MatFormFieldModule, MatTableModule, FormsModule,
        ReactiveFormsModule],
})
export class CustomMaterialModule { }
