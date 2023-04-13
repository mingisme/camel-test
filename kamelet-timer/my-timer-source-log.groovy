from('kamelet:my-timer-source?message=Hello+Kamelets&period=1000')
    .log('${body}')