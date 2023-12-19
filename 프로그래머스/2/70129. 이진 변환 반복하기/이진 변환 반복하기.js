function solution(s) {
  let answer = [0, 0];
  while (s.length > 1) {
    const newLength = s.replaceAll("0", "").length;
    answer[0]++;
    answer[1] += s.length - newLength;
    s = newLength.toString(2);
  }
  return answer;
}