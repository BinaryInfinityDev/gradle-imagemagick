FROM gradle:jdk8

ENV TZ=America/New_York
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN apt-get update \
  && apt-get install -y --no-install-recommends build-essential=12.8ubuntu1.1 webp=0.6.1-2 \
  && rm -rf /var/lib/apt/lists/*

WORKDIR /imagemagick
SHELL ["/bin/bash", "-o", "pipefail", "-c"]
RUN curl -sfL https://download.imagemagick.org/ImageMagick/download/ImageMagick.tar.gz | tar -xvz --strip-components=1 \
  && ./configure --prefix /usr \
  && make install \
  && rm -r ./*
WORKDIR /
RUN rm -rf /imagemagick

RUN ldconfig /usr/lib
