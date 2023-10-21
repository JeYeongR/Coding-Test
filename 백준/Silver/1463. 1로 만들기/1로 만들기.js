const input = require('fs').readFileSync('/dev/stdin').toString();

const x = Number(input);

const DP = new Array(x + 1).fill(0);

for(let i = 2; i <= x; i++) {
    DP[i] = DP[i - 1] + 1;
    
    if (i % 2 === 0) DP[i] = Math.min(DP[i], DP[i / 2] + 1);

    if (i % 3 === 0) DP[i] = Math.min(DP[i], DP[i / 3] + 1);	
}

console.log (DP[x])