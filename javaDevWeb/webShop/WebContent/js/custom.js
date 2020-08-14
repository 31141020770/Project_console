function view(divId) {
    subDiv = document.getElementById(divId);
    if (subDiv.style.display == 'flex') {
        subDiv.style.display = 'none';
    } else {
        subDiv.style.display = 'flex';
    }
    divs = document.querySelectorAll('.submenu');
    for (var i = 0; i < divs.length; ++i) {
        if (divs[i].id != divId) {
            divs[i].style.display = 'none';
        }
    }
    //divId is string 's1'


}
var k = 1;
slide_time = document.querySelectorAll('.slide');
slideInterval = setInterval(slide_funtion,5000);
id_slide_customer = 0;
slide_customer = document.querySelectorAll('.show_slide');
 window.onload = function () {
    slider01 = document.getElementById('slider01');
    color = document.getElementsByName('change_color');
    slider01.style.display = 'block';
    color[0].style.backgroundColor = '#d65106';
    text_over = document.getElementsByClassName('text');
    v_pills_toolbar = document.querySelectorAll('#v-pills-tab>a');
    slide__customer(id_slide_customer);
 };
function MouseEvent() {
    divs = document.querySelectorAll('.submenu');
    for (var i = 0; i < divs.length; ++i) {
        if (divs[i].style.display == 'flex') {
            divs[i].style.display = 'none';
        }
    }
}
function ShowMenu() {
    showMenu = document.getElementById('Mainmenu');
    if (showMenu.style.display == 'flex') {
        showMenu.style.display = 'none';
    } else {
        showMenu.style.display = 'flex';
    }
}
function slide_funtion(){
    if(k == 3){
        k = 0;
    }
    for (var i = 0; i < 3; ++i) {
        if (i == k) {
            slide_time[i].style.display = 'block';
        }else{
            slide_time[i].style.display = 'none';
        }
    }
    changeColor();
    k +=1;
    
}
function slides__button(f){
    k = f; 
    for (var i = 0; i < 3; ++i) {
        if (i == f) {
            slide_time[i].style.display = 'block';
        }else{
            slide_time[i].style.display = 'none';
        }
    }
    changeColor();
    k = f+1;
       
}
function slides__next(f){
    k = k + f;
    if(k > 2){
        k = 0;
    }else if(k < 0){
        k = 2;
    }   
    for (var i = 0; i < 3; ++i) {
        if (i == k) {
            slide_time[i].style.display = 'block';
        }else{
            slide_time[i].style.display = 'none';
        }
    }
    changeColor();
    k +=1; 
}
function changeColor(){
    for(var j = 0; j < 3; ++j){
        if(j == k){
            color[j].style.backgroundColor = '#d65106';
        }else{
            color[j].style.backgroundColor = 'unset';
        }
    }
}
function onmouseover_menu(x){
    text_over[x].style.bottom = 0;
}
function onmouseout_menu(x){
    text_over[x].style.bottom = '-' +120 + '%';
}
function change__menu(x){
    menu__change = document.getElementsByClassName('showOrHide');
    for(var i = 0; i < menu__change.length;++i){
        menu__change[i].style.display = 'none';
    }
    menu__change[x].style.display = 'block';
    for(var i = 0; i < v_pills_toolbar.length; ++i){
        v_pills_toolbar[i].classList.remove("home");
    }
    v_pills_toolbar[x].classList.add("home");
}


function slide__customer(){
    if(id_slide_customer >2){
        id_slide_customer = 0;
    }
    for (let index = 0; index < slide_customer.length; ++index) { 
        if(index != id_slide_customer){
            slide_customer[index].left = 100 +'%';
            slide_customer[index].classList.remove('show__menu');
        }
    }
    slide_customer[id_slide_customer].classList.add('show__menu');
    set_timer = setTimeout(change__location, 2000);
    id_slide_customer += 1;
    set_timer_1 = setTimeout(slide__customer, 2000)
    // slide_customer[1].classList.add('show__menu');
    // slide_customer[1].style.transition = 'left 2s';
    // slide_customer[1].style.left = '100px';
}
function change__location(){
    slide_customer[id_slide_customer].style.transition = 'all 3s ease';
    slide_customer[id_slide_customer].style.left = 0;
}
