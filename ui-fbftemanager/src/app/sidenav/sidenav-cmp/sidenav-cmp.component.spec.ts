import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SidenavCmpComponent } from './sidenav-cmp.component';

describe('SidenavCmpComponent', () => {
  let component: SidenavCmpComponent;
  let fixture: ComponentFixture<SidenavCmpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SidenavCmpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SidenavCmpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
