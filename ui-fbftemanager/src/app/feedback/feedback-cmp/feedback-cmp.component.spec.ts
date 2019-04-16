import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FeedbackCmpComponent } from './feedback-cmp.component';

describe('FeedbackCmpComponent', () => {
  let component: FeedbackCmpComponent;
  let fixture: ComponentFixture<FeedbackCmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FeedbackCmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FeedbackCmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
