#分页调用示例	


```
ArrayList<HashMap<String, Object>> paging = new ArrayList<>();//数据列表

Integer page;// 页码
Integer pageSize ;//分页大小

//创建分页对象
PageListDTO pageListDTO = new PageListDTO(paging, page, pageSize);

//在对象中添加列表外的数据
pageListDTO.setOtherData(obj);
```

##obj转json后结果示例
//currentPage 当前页
//firstPage 当前是否第一页
//lastPage 当前是否最后一页
//list 主要内容
//listSize 当前页数据条数
//nextPageNoSequence 当前页接下来的页码
// previousPageNoSequence 当前页之前的页码
// totalPage 总页数
// totalRecord 总数据量
// otherData 列表外的数据附加
```{
    "success": true,
    "code": "",
    "msg": "",
    "data": {
        "otherData": {
            "totalNumber": 16967,
            "totalTotalPrice": 786252.64
        },
        "totalPage": 21,
        "currentPage": 1,
        "list": [
            {
                "images": [
                    "/file/9727783a5ff3b19f593b440e47c4aa16.jpeg"
                ],
                "snapshotId": 229,
                "color": "灰色",
                "organizationName": "门店A号测试",
                "totalPrice": 30,
                "manufacturerName": "汇源集团",
                "batch": 123,
                "shelvesDate": "02-12 11:11",
                "remark": "",
                "userName": "周娃娃一二三四五六七八",
                "operator": "管理员",
                "number": 2,
                "styleNumber": "w002",
                "size": "2XL",
                "createTime": "02-12",
                "season": "冬季",
                "brand": "Mocrel",
                "priceRange": 15,
                "commodityName": "抖音小黄鸭卫衣儿童男女童中大童卡通加绒加厚连帽宝宝秋冬款童装"
            },
            {
                "images": [
                    "/file/9727783a5ff3b19f593b440e47c4aa16.jpeg"
                ],
                "snapshotId": 230,
                "color": "灰色",
                "organizationName": "门店A号测试",
                "totalPrice": 150,
                "manufacturerName": "汇源集团",
                "batch": 123,
                "shelvesDate": "02-12 11:11",
                "remark": "",
                "userName": "周娃娃一二三四五六七八",
                "operator": "管理员",
                "number": 10,
                "styleNumber": "w002",
                "size": "4XL",
                "createTime": "02-12",
                "season": "冬季",
                "brand": "Mocrel",
                "priceRange": 15,
                "commodityName": "抖音小黄鸭卫衣儿童男女童中大童卡通加绒加厚连帽宝宝秋冬款童装"
            },
            {
                "images": [
                    "/file/9727783a5ff3b19f593b440e47c4aa16.jpeg"
                ],
                "snapshotId": 231,
                "color": "灰色",
                "organizationName": "门店A号测试",
                "totalPrice": 151.5,
                "manufacturerName": "汇源集团",
                "batch": 123,
                "shelvesDate": "02-12 11:11",
                "remark": "",
                "userName": "周娃娃一二三四五六七八",
                "operator": "管理员",
                "number": 10,
                "styleNumber": "w002",
                "size": "3XL",
                "createTime": "02-12",
                "season": "冬季",
                "brand": "Mocrel",
                "priceRange": 15.15,
                "commodityName": "抖音小黄鸭卫衣儿童男女童中大童卡通加绒加厚连帽宝宝秋冬款童装"
            },
            {
                "images": [
                    "/file/9727783a5ff3b19f593b440e47c4aa16.jpeg"
                ],
                "snapshotId": 232,
                "color": "灰色",
                "organizationName": "门店A号测试",
                "totalPrice": 94,
                "manufacturerName": "汇源集团",
                "batch": 123,
                "shelvesDate": "02-12 11:11",
                "remark": "",
                "userName": "周娃娃一二三四五六七八",
                "operator": "管理员",
                "number": 5,
                "styleNumber": "w002",
                "size": "5XL",
                "createTime": "02-12",
                "season": "冬季",
                "brand": "Mocrel",
                "priceRange": 18.8,
                "commodityName": "抖音小黄鸭卫衣儿童男女童中大童卡通加绒加厚连帽宝宝秋冬款童装"
            },
            {
                "images": [
                    "/file/9727783a5ff3b19f593b440e47c4aa16.jpeg"
                ],
                "snapshotId": 233,
                "color": "米色",
                "organizationName": "门店A号测试",
                "totalPrice": 944,
                "manufacturerName": "汇源集团",
                "batch": 123,
                "shelvesDate": "02-12 11:11",
                "remark": "",
                "userName": "周娃娃一二三四五六七八",
                "operator": "管理员",
                "number": 50,
                "styleNumber": "w002",
                "size": "S",
                "createTime": "02-12",
                "season": "冬季",
                "brand": "Mocrel",
                "priceRange": 18.88,
                "commodityName": "抖音小黄鸭卫衣儿童男女童中大童卡通加绒加厚连帽宝宝秋冬款童装"
            },
            {
                "images": [
                    "/file/9727783a5ff3b19f593b440e47c4aa16.jpeg"
                ],
                "snapshotId": 234,
                "color": "灰色",
                "organizationName": "门店A号测试",
                "totalPrice": 18.88,
                "manufacturerName": "汇源集团",
                "batch": 123,
                "shelvesDate": "02-12 11:11",
                "remark": "",
                "userName": "周娃娃一二三四五六七八",
                "operator": "管理员",
                "number": 1,
                "styleNumber": "w002",
                "size": "2XL",
                "createTime": "02-12",
                "season": "冬季",
                "brand": "Mocrel",
                "priceRange": 18.88,
                "commodityName": "抖音小黄鸭卫衣儿童男女童中大童卡通加绒加厚连帽宝宝秋冬款童装"
            },
            {
                "images": [
                    "/file/1c89be3ffa82616a41ccebc1242a397d.jpeg"
                ],
                "snapshotId": 228,
                "color": "黄色",
                "organizationName": "门店B号测试",
                "totalPrice": 750,
                "manufacturerName": "KFactory",
                "batch": 122,
                "shelvesDate": "01-31 16:19",
                "remark": "",
                "userName": "rkkwok",
                "operator": "小小",
                "number": 50,
                "styleNumber": "d002",
                "size": "L",
                "createTime": "01-31",
                "season": "",
                "brand": "ONLY",
                "priceRange": 15,
                "commodityName": "ONLY2018夏季新荷叶边碎花雪纺半身裙女|1182165"
            },
            {
                "images": [
                    "/file/b30bfb2d35b91df755df19dae94a66c5.jpeg",
                    "/file/411b889cd24a99e7a6c8f53eca9e1e86.jpeg",
                    "/file/7f630620bd77d70ca6789512e9b71c19.jpeg",
                    "/file/422042d38b18d4006b788611c101d3a6.jpeg",
                    "/file/9b88318c23965772ba05f10b3bb3d83c.jpeg",
                    "/file/d56059484798f0cdc1cc080fba3e49a9.jpeg",
                    "/file/5a4eafe61723ca5cfcffb226b1e90cb5.jpeg",
                    "/file/85816fb640f48173afb29c968b6c78f1.jpeg",
                    "/file/ac4f6cd1e2f0a7daa6d527d3d185d556.jpeg"
                ],
                "snapshotId": 227,
                "color": "灰色",
                "organizationName": "门店A号测试",
                "totalPrice": 180,
                "manufacturerName": "KFactory",
                "batch": 121,
                "shelvesDate": "01-31 14:55",
                "remark": "",
                "userName": "rk",
                "operator": "一二三四五上山打老小虎",
                "number": 15,
                "styleNumber": "test0034",
                "size": "XL",
                "createTime": "01-31",
                "season": "夏季",
                "brand": "宝马",
                "priceRange": 12,
                "commodityName": "测试商品质量管理体系认证制度"
            },
            {
                "images": [
                    "/file/8afdd608feaa6551fee76afbf8242d69.png",
                    "/file/8f84efca98b8d45e70a60d276c0ad9ae.png"
                ],
                "snapshotId": 225,
                "color": "白色",
                "organizationName": "门店A号测试",
                "totalPrice": 56,
                "manufacturerName": "大大大",
                "batch": 119,
                "shelvesDate": "09-18 10:09",
                "remark": "",
                "userName": "白甜甜",
                "operator": "管理员",
                "number": 1,
                "styleNumber": "nx0001",
                "size": "L",
                "createTime": "09-18",
                "season": "",
                "brand": "",
                "priceRange": 56,
                "commodityName": "南夕姐姐 露肩T恤秋装女2018新款修身长袖体恤网红打底衫心机上衣"
            },
            {
                "images": [
                    "/file/8afdd608feaa6551fee76afbf8242d69.png",
                    "/file/8f84efca98b8d45e70a60d276c0ad9ae.png"
                ],
                "snapshotId": 224,
                "color": "白色",
                "organizationName": "门店A号测试",
                "totalPrice": 56,
                "manufacturerName": "KFactory",
                "batch": 118,
                "shelvesDate": "09-14 18:11",
                "remark": "",
                "userName": "一二三四五上山打老小虎",
                "operator": "klc",
                "number": 1,
                "styleNumber": "nx0001",
                "size": "L",
                "createTime": "09-14",
                "season": "",
                "brand": "",
                "priceRange": 56,
                "commodityName": "南夕姐姐 露肩T恤秋装女2018新款修身长袖体恤网红打底衫心机上衣"
            }
        ],
        "pageSize": 10,
        "totalRecord": 201,
        "scale": 3,
        "firstPage": true,
        "lastPage": false,
        "listSize": 10,
        "nextPageNoSequence": [
            2,
            3,
            4
        ],
        "previousPageNoSequence": []
    }
}
```

***
# ArrayList<HashMap<String, Object>> 格式对象排序
```
ArrayList<HashMap<String, Object>> result = new ArrayList<>();//要排序的对象

String propName; //根据该字段排序
String dir ; //asc正序 desc倒序
CollectionUtils.listMapSort(result, propName, dir);

```
