/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
  if (!strs.length) return "";

  let answer = strs[0];
  for (let i = 1; i < strs.length; i++) {
    for (let j = 0; j < answer.length; j++) {
      if (answer[j] !== strs[i][j]) {
        answer = answer.substring(0, j);
      }
    }
  }

  return answer;
};