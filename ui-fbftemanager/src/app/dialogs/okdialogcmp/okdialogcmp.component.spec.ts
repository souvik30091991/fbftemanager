import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OkdialogcmpComponent } from './okdialogcmp.component';

describe('OkdialogcmpComponent', () => {
  let component: OkdialogcmpComponent;
  let fixture: ComponentFixture<OkdialogcmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OkdialogcmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OkdialogcmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
