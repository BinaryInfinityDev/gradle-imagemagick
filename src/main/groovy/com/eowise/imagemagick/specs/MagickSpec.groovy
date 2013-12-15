package com.eowise.imagemagick.specs

/**
 * Created by aurel on 14/12/13.
 */
interface MagickSpec {


    def verbose()

    def input()

    def xc(String color)

    def color(String color)

    def size(String size)

    def resize(float ratio)

    def gravity(String gravity)

    def geometry(String geometry)

    def swap()

    def cloneLast()

    def background(String color)

    def stack(Closure closure)

    def condition(String condition, Closure closure)

    def shadow(String param)

    def draw(Closure closure)

    def border(Closure closure)

    def layers(String operation)

    def repage()

    def composite()
}