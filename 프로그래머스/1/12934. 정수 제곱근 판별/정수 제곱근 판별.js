function solution(n) {
  const num = Math.sqrt(n);

  return num === Math.floor(num) ? (num + 1) ** 2 : -1;
}