import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BancaElectronicaComponent } from './banca-electronica.component';

describe('BancaElectronicaComponent', () => {
  let component: BancaElectronicaComponent;
  let fixture: ComponentFixture<BancaElectronicaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BancaElectronicaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BancaElectronicaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
