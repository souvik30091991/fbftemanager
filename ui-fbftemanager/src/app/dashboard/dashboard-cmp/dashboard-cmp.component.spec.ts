import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DashboardCmpComponent } from './dashboard-cmp.component';

describe('DashboardCmpComponent', () => {
  let component: DashboardCmpComponent;
  let fixture: ComponentFixture<DashboardCmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DashboardCmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DashboardCmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
