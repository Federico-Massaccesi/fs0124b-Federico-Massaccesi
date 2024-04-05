export interface iUser {

  nome:string,
  cognome:string,
  email:string,
  password?:string

}

export interface iLoginData{

  email:string,
  password:string

}

export interface iAccessData{

  accessToken:string,
  user:iUser
}
