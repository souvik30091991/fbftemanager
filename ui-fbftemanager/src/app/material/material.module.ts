import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {
    MatButtonModule, MatNativeDateModule, MatIconModule, MatSidenavModule, MatListModule, MatToolbarModule, MatDialogModule,
    MatInputModule, MatDatepickerModule, MatFormFieldModule, MatTableModule, MatPaginatorModule, MatSortModule
} from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

@NgModule({
    imports: [CommonModule, MatButtonModule, MatToolbarModule, MatNativeDateModule,
        MatIconModule, MatSidenavModule, MatListModule, MatDialogModule,
        MatInputModule, MatDatepickerModule, MatFormFieldModule, FormsModule,
        BrowserModule, BrowserAnimationsModule, MatTableModule, ReactiveFormsModule,
        MatPaginatorModule, MatFormFieldModule, MatSortModule],
    exports: [CommonModule, MatButtonModule, MatToolbarModule, MatNativeDateModule,
        MatIconModule, MatSidenavModule, MatListModule, MatDialogModule,
        MatInputModule, MatDatepickerModule, MatFormFieldModule, FormsModule,
        BrowserModule, BrowserAnimationsModule, MatTableModule, ReactiveFormsModule,
        MatPaginatorModule, MatFormFieldModule, MatSortModule],
})
export class CustomMaterialModule { }
