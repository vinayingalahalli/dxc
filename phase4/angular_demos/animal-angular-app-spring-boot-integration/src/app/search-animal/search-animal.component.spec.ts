import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchAnimalComponent } from './search-animal.component';

describe('SearchAnimalComponent', () => {
  let component: SearchAnimalComponent;
  let fixture: ComponentFixture<SearchAnimalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchAnimalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchAnimalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
