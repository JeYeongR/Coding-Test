function solution(n) {
  const arr = n.toString().split("").reverse();

  const answer = arr.map((num) => +num);

  return answer;
}