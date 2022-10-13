import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConstumerComponent } from './constumer.component';

describe('ConstumerComponent', () => {
  let component: ConstumerComponent;
  let fixture: ComponentFixture<ConstumerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConstumerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ConstumerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
