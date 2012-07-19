define(["./Component", "common/FileUtils"], function(Component, FileUtils) {
  return Component.extend({
    initialize: function() {
      var src;
      Component.prototype.initialize.apply(this, arguments);
      this.set("type", "ShapeModel");//ImageModel
      src = this.get("src");
      this.set("shapeType", FileUtils.imageType(src));//imagetype
      this.on("change:src", this._updateCache, this);
      this.cachedShape = new Shape();
      return this._updateCache();
    },
    _updateCache: function() {
      return this.cachedShape.src = this.get("src");
    },
    toBase64: function() {},
    constructor: function ShapeModel() {
			Component.prototype.constructor.apply(this, arguments);
		}
  });
});
