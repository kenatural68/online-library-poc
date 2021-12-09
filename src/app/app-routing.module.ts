import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { SigninComponent } from './components/signin/signin.component';
import { HomeComponent } from './components/home/home.component';
import { LibraryComponent } from './components/library/library.component';
import { ShopComponent } from './components/shop/shop.component';
import { AccountComponent } from './components/account/account.component';
import { GenrepickComponent } from './components/genrepick/genrepick.component';
import { ProfileComponent } from './components/profile/profile.component';
import { AdminComponent } from './components/admin/admin.component';
import { AddbooksComponent } from './components/addbooks/addbooks.component';
import { BookinfoComponent } from './components/bookinfo/bookinfo.component';

const routes: Routes = [
  {path: '', pathMatch: 'full', redirectTo: 'home'},
  {path: 'login' , component: LoginComponent},
  {path: 'signin' , component: SigninComponent},
  {path: 'home', component: HomeComponent},
  {path: 'library', component: LibraryComponent},
  {path: 'shop', component: ShopComponent},
  {path: 'account', component: AccountComponent},
  {path: 'genrepick', component: GenrepickComponent},
  {path: 'profile', component:ProfileComponent},
  {path: 'admin', component: AdminComponent},
  {path: 'addbooks', component: AddbooksComponent},
  {path: 'bookinfo', component: BookinfoComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
