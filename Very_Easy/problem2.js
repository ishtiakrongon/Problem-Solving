// Convert minutes into seconds

function minToSec(minutes) {
    var convertMins = minutes * 60;
    return convertMins;
}

var seconds = minToSec(3);
console.log('Minute to seconds is: ', seconds);