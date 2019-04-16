import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewfeedbackCmpComponent } from './viewfeedback-cmp.component';

describe('ViewfeedbackCmpComponent', () => {
  let component: ViewfeedbackCmpComponent;
  let fixture: ComponentFixture<ViewfeedbackCmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewfeedbackCmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewfeedbackCmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
