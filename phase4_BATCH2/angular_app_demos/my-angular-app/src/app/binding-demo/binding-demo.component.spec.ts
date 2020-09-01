import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BindingDemoComponent } from './binding-demo.component';

describe('BindingDemoComponent', () => {
  let component: BindingDemoComponent;
  let fixture: ComponentFixture<BindingDemoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BindingDemoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BindingDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
