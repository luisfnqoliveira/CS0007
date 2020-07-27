
window.onload = (e)  => setup();

class Point {
  constructor() {
    this.x = 0;
    this.y = 0;
  }
}


function setup() {
  let button = document.getElementById("runButton");
  button.onclick = (e) => run();
}

function run() {
  console.log("Hello world");
  let p = new Point();
  let radius = 0.5;
  let nHits = 0.0;
  let nDarts = parseInt(document.getElementById("nDarts").value);
  for(let i=0; i<nDarts; i++) {
    p.x = (Math.random()-0.5) *2* radius;
    p.y = (Math.random()-0.5) *2* radius;
    if(Math.pow(p.x, 2) + Math.pow(p.y, 2) <= Math.pow(radius, 2)) {
      nHits++;
    }
  }

  console.log(4*nHits/nDarts);

}
