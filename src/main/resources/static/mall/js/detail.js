

var itemaSwiper = new Swiper('.swiper-container', {
    //设置无限循环播放
    loop: true,
    //设置上下页按钮
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },
    scrollbar: {
        el: '.swiper-scrollbar',
    },
    slidesPerView: 1,
    spaceBetween: 30,
    effect: 'fade',//渐变
    lazy:true,
    speed:2000,
    parallax : true,
    pagination: {
        el: '.swiper-pagination',
        type: 'progressbar',
        clickable: true,

    },
});
itemaSwiper.scrollbar.$dragEl.css('background','#fff');
