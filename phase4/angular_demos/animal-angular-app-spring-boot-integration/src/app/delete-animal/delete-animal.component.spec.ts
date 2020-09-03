import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteAnimalComponent } from './delete-animal.component';

describe('DeleteAnimalComponent', () => {
  let component: DeleteAnimalComponent;
  let fixture: ComponentFixture<DeleteAnimalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeleteAnimalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteAnimalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
