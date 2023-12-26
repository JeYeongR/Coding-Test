function solution(people, limit) {
    people.sort((a, b) => a - b);
    let lt = 0;
    for(let rt = people.length - 1; lt < rt; rt--) {
        if( people[lt] + people[rt] <= limit ) lt++;
    }    
    return people.length - lt;
}