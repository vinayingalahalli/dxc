import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddAvengerComponent } from './add-avenger.component';

describe('AddAvengerComponent', () => {
  let component: AddAvengerComponent;
  let fixture: ComponentFixture<AddAvengerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddAvengerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddAvengerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
