export interface iInterface {


  id:number
  title:string
  body:string
  userId:number
  tags:string[]
  active:boolean
}

export interface iTotal{

  posts:iInterface[]
}
