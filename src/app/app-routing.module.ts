import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SigninComponent } from './signin/signin.component';
import { HomeComponent } from './home/home.component';
import { LibraryComponent } from './library/library.component';
import { ShopComponent } from './shop/shop.component';
import { AccountComponent } from './account/account.component';
import { GenrepickComponent } from './genrepick/genrepick.component';
import { ProfileComponent } from './profile/profile.component';

const routes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: 'home'},
  {path: 'login' , component: LoginComponent},
  {path: 'signin' , component: SigninComponent},
  {path: 'home', component: HomeComponent},
  {path: 'library', component: LibraryComponent},
  {path: 'shop', component: ShopComponent},
  {path: 'account', component: AccountComponent},
  {path: 'genrepick', component: GenrepickComponent},
  {path: 'profile', component:ProfileComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
