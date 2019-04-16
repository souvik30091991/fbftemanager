import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewfteCmpComponent } from './viewfte-cmp.component';

describe('ViewfteCmpComponent', () => {
  let component: ViewfteCmpComponent;
  let fixture: ComponentFixture<ViewfteCmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewfteCmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewfteCmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
