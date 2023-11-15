function solution(s) {
    const length = s.length / 2  
  
    return s.length % 2 === 0 ? s.slice(length - 1, length + 1) : s[Math.floor(length)]
}