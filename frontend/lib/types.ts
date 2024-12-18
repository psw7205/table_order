interface ItemStatus {
  A: "판매중"
  D: "판매 안함"
  SO: "매진"
}

export interface ItemType {
  id: number
  name: string
  price: number
  description: string
  imageAlt: string
  imageSrc: string
  status: ItemStatus
  profile_path: string
  category_id: string
  category_name: string
  category_priority: number
}

export interface LineItemType extends ItemType {
  amount: number
}

export interface categoryType {
  category_name: string
  category_priority: number
}

export interface OrderType {
  order_number: string
  payment_status: string
  table_number: number
  total_amount: number
  total_price: number
}
