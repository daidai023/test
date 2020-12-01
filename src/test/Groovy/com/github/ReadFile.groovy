package com.github

import spock.lang.Specification

class ReadTxt extends Specification {
    FileService fileService

    def setup() {
        fileService = new FileService()
    }

    def "should create and read txt file successfully"() {
        given:"create txt file"
        def file = fileService.createFile("./src/test/resources/com/github/data/test.txt")
        when:"write some content to the file"
        //支持通过<<写入文件
        file << "name,age,address\n"
        file << "Tom,100,chengdu\n"
        file << "Daisy,29,shanghai"
        then:"print file content"

        //读取txt文件
        def lines = file.readLines()
        lines.each {println it}
//        and:"delete file"
//        file.delete()
    }

    def "should create and read txt file successfuly!"() {
        given:"create txt file"
        def file = fileService.createFile("./src/test/resources/com/github/data/daisy.txt")
        when:"write some content to the file"
        file << "鹅鹅鹅，曲项向天歌\n"
        file << "白毛浮绿水\n"
        file << "红掌拨清波"
        then:"print file content"

        def lines = file.readLines()
        lines.each {println it}
    }
}
