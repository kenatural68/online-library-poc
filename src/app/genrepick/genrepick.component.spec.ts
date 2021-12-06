import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GenrepickComponent } from './genrepick.component';

describe('GenrepickComponent', () => {
  let component: GenrepickComponent;
  let fixture: ComponentFixture<GenrepickComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GenrepickComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GenrepickComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
