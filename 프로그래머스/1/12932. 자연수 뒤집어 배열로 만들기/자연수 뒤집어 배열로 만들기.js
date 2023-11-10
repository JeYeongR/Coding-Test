function solution(n) {
  return n.toString().split("").reverse().map(num => +num);
}