import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BindingdemoComponent } from './bindingdemo.component';

describe('BindingdemoComponent', () => {
  let component: BindingdemoComponent;
  let fixture: ComponentFixture<BindingdemoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BindingdemoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BindingdemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
