import { clsx, type ClassValue } from "clsx"
import { twMerge } from "tailwind-merge"

export function cn(...inputs: ClassValue[]) {
  return twMerge(clsx(inputs))
}

export function commaizeNumber(value: string | number) {
  const numStr = String(value)
  const decimalPointIndex = numStr.indexOf(".")
  const commaizeRegExp = /(\d)(?=(\d\d\d)+(?!\d))/g

  return decimalPointIndex > -1
    ? numStr.slice(0, decimalPointIndex).replace(commaizeRegExp, "$1,") +
        numStr.slice(decimalPointIndex)
    : numStr.replace(commaizeRegExp, "$1,")
}
