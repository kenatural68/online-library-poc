import { Component, OnInit } from '@angular/core';

interface Country {
  name: string;
}

const COUNTRIES: Country[] = [
  {
    name: 'book 1',
  },
  {
    name: 'book 2',
  },
  {
    name: 'book 3',
  },
  {
    name: 'book 4',
  }
];

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  countries = COUNTRIES;

  constructor() { }

  ngOnInit(): void {
  }

}
